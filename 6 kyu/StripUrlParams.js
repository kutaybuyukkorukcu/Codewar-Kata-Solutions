function stripUrlParams(url, paramsToStrip=[]){
	var regex = /([?&]((\w+)=(\w+)))/g;
	var result = regex.exec(url);
	var tokens = [];
	var paramKey = {};
	while (result) {
		if (!paramKey[result[3]] && !paramsToStrip.some(p=> p==result[3])) {
			paramKey[result[3]] = true;
			tokens.push(result.slice(2));
		}
		result = regex.exec(url);
	}
	var r = /.+\?/g;
	var withoutParam = r.exec(url)||url ;
	return withoutParam + tokens.map(t=>t[0]).join('&'); }
