package school.mjc.stage0.conditions.finalTask;

public class SeasonDeterminer {
    public void tellTheSeason(int monthNumber) {
        String season = switch (monthNumber) {
            case (1):
            case (2):
            case (12):
                yield "Winter";
            case (3):
            case (4):
            case (5):
                yield "Spring";
            case (6):
            case (7):
            case (8):
                yield "Summer";
            case (9):
            case (10):
            case (11):
                yield "Autumn";
            default:
                yield "Wrong month number";
        };
        System.out.println(season);
    }
}
