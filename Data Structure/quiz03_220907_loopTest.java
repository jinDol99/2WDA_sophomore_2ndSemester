public class quiz03_220907_loopTest{
    public static void quiz01() {
        int sum = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				sum = sum + 1;
			}
			System.out.print(sum);
		}
		return;
    }

    public static void quiz02() {
        int sum = 0;
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j< 15; j++) {
                sum = sum + 1;
            }
        }
        System.out.print(sum);
        return;
    }

    public static void quiz03() {
        int sum = 0;
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				for (int k = 0; k < 10; k++) {
					sum = sum + 1;
				}
			}
		}
		System.out.println(sum);
		return;
	}

    public static void quiz04() {
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; j < 3; j++) {
                    sum = sum + 1;
                }
            }
        }
        System.out.println(sum);
        return;
    }

    public static void quiz05() {
        int sum = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 100; j++) {
				for (int k = 0; i < 10; i++) {
					sum = sum + 1;
				}
			}
		}
		System.out.println(sum);
		return;
    }
    
    public static void quiz06() {
        int sum = 0;
        for (int i = 0; i < 30; i++) {
            for (int j = 0; i < 30; i++) {
                sum = sum + 1;
            }
        }
        System.out.println(sum);
        return;
    }

    public static void quiz07() {
        int sum = 0;
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 10; j++) {
				sum = sum + i;
				i = i + 1;
			}
		}
		System.out.println(sum);
		return;
    }

    public static void quiz08() {
        int sum = 0;
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 20; j++) {
                sum = sum + j;
                i = i + 1;
            }
        }
        System.out.println(sum);
        return;
    }

    public static void quiz09() {
        int sum = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 50; j++) {
				sum = sum + 2;
			}
		}
		System.out.println(sum);
		return;
    }

    public static void quiz10() {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 30; j++) {
                if (i > 2 && j < 5) {
                    sum = sum + i;
                }
            }
        }
        System.out.println(sum);
        return;
    }

    public static void quiz11() {
        int sum = 0;
		for (int i = 0; i < 50; i++) {
			for (int j = 0; j < 100; j++) {
				if (i < 3 || j > 4) {
					sum = sum + 1;
				}
			}
		}
		System.out.println(sum);
		return;
    }

    public static void quiz12() {
        int sum = 0;
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 100; j++) {
                if (j < 3 && j > j - 1) {
                    sum = sum + 1;
                }
            }
        }
        System.out.println(sum);
        return;
    }

    public static void quiz13() {
        int sum = 0;
		for (int i = 0; i < 40; i++) {
			for (int j = 0; j < 100; j++) {
				if (j < i) {
					sum = sum + 1;
				}
			}
		}
		System.out.println(sum);
		return;
    }

    public static void quiz14() {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 30; j++) {
                if (j > i) {
                    sum = sum + 1;
                }
            }
        }
        System.out.println(sum);
        return;
    }
    public static void main(String[] args) {
        quiz01();
        System.out.println("\n-----------------");
        quiz02();
        System.out.println("\n-----------------");
        quiz03();
        System.out.println("-----------------");
        quiz04();
        System.out.println("-----------------");
        quiz05();
        System.out.println("-----------------");
        quiz06();
        System.out.println("-----------------");
        quiz07();
        System.out.println("-----------------");
        quiz08();
        System.out.println("-----------------");
        quiz09();
        System.out.println("-----------------");
        quiz10();
        System.out.println("-----------------");
        quiz11();
        System.out.println("-----------------");
        quiz12();
        System.out.println("-----------------");
        quiz13();
        System.out.println("-----------------");
        quiz14();
    }
}