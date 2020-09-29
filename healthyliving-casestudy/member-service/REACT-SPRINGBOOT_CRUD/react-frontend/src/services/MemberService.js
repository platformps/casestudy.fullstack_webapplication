import axios from 'axios';

const MEMBER_API_BASE_URL = "http://localhost:8080/api/members";

class MemberService {

  getMembers(){
    return axios.get(MEMBER_API_BASE_URL);
}
  createMember(member){
    return axios.post(MEMBER_API_BASE_URL,member);
  }
  getMemberById(id){
    return axios.get(MEMBER_API_BASE_URL + '/' + id);
  }
  updateMember(member, id){
    return axios.put(MEMBER_API_BASE_URL + '/' + id, member)
  }
  deleteMember(memberId){
    return axios.delete(MEMBER_API_BASE_URL + '/' + memberId);
  }
}

export default new MemberService()