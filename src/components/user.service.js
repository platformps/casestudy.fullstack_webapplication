import axios from 'axios';
import authHeader from './auth-header';

const API_URL = "https://upkeep-assistant.herokuapp.com/api/auth/";
class UserService {
  getPublicContent() {
    return axios.get(API_URL + 'all');
  }
}
  

export default new UserService();
