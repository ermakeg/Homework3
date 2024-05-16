public class Main {
    public static void main(String[] args) {

        int a = 40000;
        System.out.println("Значение переменной a с типом int равно " + a);
        byte m = 105;
        System.out.println("Значение переменной m с типом byte равно " + m);
        short k = 15989;
        System.out.println("Значение переменной k с типом short равно " + k);
        long z = -3585L;
        System.out.println("Значение переменной z с типом long равно " + z);
        float p = 2.15f;
        System.out.println("Значение переменной p с типом float равно " + p);
        double d = 15.77;
        System.out.println("Значение переменной d с типом double равно " + d);

        float numberOne = 27.12f;
        System.out.println(numberOne);
        long numberTwo = 987678965549L;
        System.out.println(numberTwo);
        float numberThree = 2.786f;
        System.out.println(numberThree);
        short numberFour = 569;
        System.out.println(numberFour);
        short numberFive = -159;
        System.out.println(numberFive);
        short numberSix = 27897;
        System.out.println(numberSix);
        byte numberSeven = 67;
        System.out.println(numberSeven);

        byte lydmilaPupils = 23;
        byte annPupils = 27;
        byte ekaterinaPupils = 30;
        short allSheets = 480;
        short allPupils = (short) (lydmilaPupils + annPupils + ekaterinaPupils);
        System.out.println("Всего в трех классах обучается " + allPupils + " учеников.");
        short sheetOnOnePupil = (short) (allSheets/allPupils);
        System.out.println("На каждого ученика рассчитано " + sheetOnOnePupil + " листов буаги.");

        byte performInTwoMin = 16;
        System.out.println("За 2 минуты машина произвела " + performInTwoMin + " штук бутылок.");
        byte performInOneMin = (byte) (performInTwoMin/2);
        System.out.println("За 1 минуту машина произвела " + performInOneMin + " штук бутылок.");
        short performInTwentyMin = (short) (performInOneMin * 20);
        System.out.println("За 20 минут машина произвела " + performInTwentyMin + " штук бутылок.");
        short performPerDay = (short) ((performInTwentyMin *3 ) * 24);
        System.out.println("За сутки машина произвела " + performPerDay + " штук бутылок.");
        int performThreeDays = performPerDay * 3;
        System.out.println("За 3 суток машина произвела " + performThreeDays + " штук бутылок.");
        int performOneMonth = performThreeDays * 10;
        System.out.println("За 1 месяц машина произвела " + performOneMonth + " штук бутылок.");

        byte totalJar = 120;
        byte jarWhitePaintInOneClassroom = 2;
        byte jarBrownPaintInOneClassroom = 4;
        byte jarToOneClassroom = (byte) (jarWhitePaintInOneClassroom + jarBrownPaintInOneClassroom);
        System.out.println("Для покраски одного класса нужно " + jarToOneClassroom + " банок краски.");
        byte totalClassrooms = (byte) (totalJar / jarToOneClassroom);
        byte totalJarsOfWhitePaint = (byte) (jarWhitePaintInOneClassroom * totalClassrooms);
        byte totalJarsOfBrownPaint = (byte) (jarBrownPaintInOneClassroom * totalClassrooms);
        System.out.println("В школе, где " + totalClassrooms + " классов, нужно " + totalJarsOfWhitePaint + " банок белой краски и " + totalJarsOfBrownPaint + " банок коричневой краски.");

        short weightBananasForBreakfast = 80 * 5;
        short weightMilkForBreakfast = 105 * 2;
        short weightIceCreamForBreakfast = 100 * 2;
        short weightEggsForBreakfast = 70 * 4;
        short totalWeightOfBreakfast = (short) (weightBananasForBreakfast + weightMilkForBreakfast + weightIceCreamForBreakfast + weightEggsForBreakfast);
        float totalWeightOfBreakfastOther = totalWeightOfBreakfast / 1000f;
        System.out.println("Завтрак спортсмена по одному из рецептов весит " + totalWeightOfBreakfastOther + " килограмм.");

        byte totalWeightLoss = 7;
        float weightLossLight = 250 / 1000f;
        float weightLossHard = 500 / 1000f;
        float daysWeightLossLight = totalWeightLoss / weightLossLight;
        System.out.println("Чтобы похудеть на 7 килограмм, теряя по 250 грамм в день, потребуется " + daysWeightLossLight + " дней.");
        float daysWeightLossHard = totalWeightLoss / weightLossHard;
        System.out.println("Чтобы похудеть на 7 килограмм, теряя по 500 грамм в день, потребуется " + daysWeightLossHard + " дней.");

        int mariaSalaryBefore = 67760;
        int mariaAnnualIncomeBefore = mariaSalaryBefore * 12;
        int mariaSalaryAfter = (mariaSalaryBefore * 110) / 100;
        int mariaAnnualIncomeAfter = mariaSalaryAfter * 12;
        int mariaAnnualIncomeDifference = mariaAnnualIncomeAfter - mariaAnnualIncomeBefore;
        System.out.println("Маша теперь получает " + mariaSalaryAfter + " рублей. Годовой доход вырос на " + mariaAnnualIncomeDifference + " рублей.");

        int denisSalaryBefore = 83690;
        int denisAnnualIncomeBefore = denisSalaryBefore * 12;
        int denisSalaryAfter = (denisSalaryBefore * 110) / 100;
        int denisAnnualIncomeAfter = denisSalaryAfter * 12;
        int denisAnnualIncomeDifference = denisAnnualIncomeAfter - denisAnnualIncomeBefore;
        System.out.println("Денис теперь получает " + denisSalaryAfter + " рублей. Годовой доход вырос на " + denisAnnualIncomeDifference + " рублей.");

        int kristenSalaryBefore = 76230;
        int kristenAnnualIncomeBefore = kristenSalaryBefore * 12;
        int kristenSalaryAfter = (kristenSalaryBefore * 110) / 100;
        int kristenAnnualIncomeAfter = kristenSalaryAfter * 12;
        int kristenAnnualIncomeDifference = kristenAnnualIncomeAfter - kristenAnnualIncomeBefore;
        System.out.println("Кристина теперь получает " + kristenSalaryAfter + " рублей. Годовой доход вырос на " + kristenAnnualIncomeDifference + " рублей.");
    }
}