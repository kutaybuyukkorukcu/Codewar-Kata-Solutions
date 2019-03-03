function Node(data, next = null) {
  this.data = data;
  this.next = next;
}

function length(head) {
  let l = 1;
  if(head === null) { return 0;}
  while(head.next !== null) {
    head = head.next;
    l++;
  }
  return l;
}

function count(head, data) {
  let count = 0;
  if(head === null) return 0;
  while(head !== null){
    if(head.data === data){
      count++
    }
    head = head.next;
  }
  return count;
}
