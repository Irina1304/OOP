import Unit.Bandit;
import Unit.Crossbowman;
import Unit.Fermer;
import Unit.Monk;
import Unit.Sniper;
import Unit.Spearman;
import Unit.Witch;

/*
Крестьянин: имя, здоровье, ходить, бегать, выносливость, подача патронов, подача пищи.
Разбойник: имя, здоровье, ходить, бегать, выносливость, разбой, жестокость.
Снайпер: имя, здоровье, ходить, бегать, выносливость, боеприпасы, маскировка.
Колдун: имя, здоровье, ходить, бегать, выносливость, мана, артефакты.
Копейщик: имя, здоровье, ходить, бегать, выносливость, владение копьем, умение держать строй.
Арбалетчик: имя; здоровье; ходить; бегать; выносливость; боеприпасы; меткость.
Монах: имя, здоровье, ходить, бегать, выносливость, мана, заклинания.
*/




public class Game {

    public static void main(String[] args) {
        Fermer fermer = new Fermer("fermer_name", 100, 1, 1, 1, 1);
        Bandit bandit = new Bandit("bandit_name", 100, 10, 1, 1, 10);
        Sniper sniper = new Sniper("sniper_name", 100, 10, 5, 1, 1);
        Witch witch = new Witch("withc_name", 100, 5, 10, 10, 5);
        Spearman spearman = new Spearman("spearman_name", 100, 10, 5, 1, 10);
        Crossbowman crossbowman = new Crossbowman("crossbowman_name", 100, 10, 10, 1, 1);
        Monk monk = new Monk("monk_name", 100, 5, 100, 10, 5);
        
    }
    

}
