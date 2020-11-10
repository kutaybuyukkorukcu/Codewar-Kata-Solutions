// https://www.codewars.com/kata/55beec7dd347078289000021

const Node = (data, next = null) => {
  this.data = data;
  this.next = next;
}

const length = (head) => {
  let l = 1;
  if(head === null) { return 0;}
  while(head.next !== null) {
    head = head.next;
    l++;
  }
  return l;
}

const count = (head, data) => {
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

// 🧙‍♂️👍