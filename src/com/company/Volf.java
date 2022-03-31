package com.company;

      public   class  Volf extends Animal  {
            public Volf(String name, int salmak) {
                super(name, salmak);
            }

          @Override
          public void hunt() {
              System.out.println("Volf is attak");
          }

          @Override
          public String toString() {
              return "Volf " + super.toString();
          }
      }
