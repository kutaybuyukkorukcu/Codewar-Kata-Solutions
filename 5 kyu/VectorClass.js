var Vector = function(comps) {
	
	var self = this;

	this.toString = () => 
		{ return '(' + comps.join(',') + ')'; }

	this.equals = (vector) => {
		return self.toString() == vector.toString(); }


	this.getComps = () => { return comps; }

	function ops(vector1, vector2, cb) {
		var comp1 = vector1.getComps(),
		    comp2 = vector2.getComps();
	
		if (comp1.length !== comp2.length){
			throw new Error('Both vectors need to be of the same length');
		}

		var newComp = comp1.map( (item, index) => {
			return cb(item, comp2[index]);
		});

		return new Vector(newComp);

	}
	
	this.add = (vect) => 
	{	return ops(self, vect, (a, b) => { return a + b }); }

	this.subtract = (vect) => {
		return ops(self, vect, (a, b) => { return a - b }); }

	this.dot = (vect) => {
		var res = ops(self, vect, (a, b) => { return a * b });
		return res.getComps().reduce( (acc, item) =>
						{ return acc + item; });
  }

	this.norm = () => {

		var sqrAndAdd = self.getComps()
			.map( (item) => { return item * item; })
			.reduce( (acc, item) => { return acc + item; });
		return Math.sqrt(sqrAndAdd);
	};
}
