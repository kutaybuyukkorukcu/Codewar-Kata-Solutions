// https://www.codewars.com/kata/5269452810342858ec000951

const isValidCoordinates = (coordinates) => {

  let coordinatesReg = /^(-?\d+(\.\d+)?),\s*(-?\d+(\.\d+)?)$/g
  if (!coordinatesReg.test(coordinates)) 
    return false;
  let arrCoordinates = coordinates.split(',');
  try {
    let strLat = arrCoordinates[0].trim();    
    let lat = parseFloat(strLat);
    if (lat < -90 || lat > 90) 
      return false;
  } catch (e) {
    return false;
  }
  try {
    let strLng = arrCoordinates[1].trim();    
    let lng = parseFloat(strLng);
    if (lng < -180 || lng > 180) 
      return false;
  } catch (e) {
    return false;
  }
  return true;
}

// 🧙‍♂️👍
