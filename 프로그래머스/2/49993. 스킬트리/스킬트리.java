import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        Check check = new Check(skill);
        
        for (String tree : skill_trees) {
            if(check.isTrue(tree)) {
                answer++;
            }
        }
        return answer;
    }
}

class Check {
    private String skill;
    
    public Check(String skill) {
        this.skill = skill;
    }
    
    public boolean isTrue(String tree) {
        int idx = 0;
        
        for (int i = 0; i < tree.length(); i++) {
            char curSkill = tree.charAt(i);
            int idxSkill = skill.indexOf(curSkill);
            
            if (idxSkill == -1) {
                continue;
            }
            
            if (idxSkill == idx) {
                idx++;
            } else {
                return false;
            }
        }
        return true;
    } 
}