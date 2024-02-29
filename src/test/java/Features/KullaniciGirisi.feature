@InfinityGelisim
Feature: Infinity gelisim kullanici girisi testi

  @NegativeLogin
  Scenario: Kullanici adi yanlis - sifre dogru
    Given Kullanici giris sayfasindadir
    Given Kullanici adini yanlis yazar
    Given Sifresini yazar
    Then Login butonuna tiklar

    @PositiveLogin
    Scenario: Kullanici adi dogru - sifre dogru
      Given Kullanici giris sayfasindadir
      Given Kullanici adini dogru yazar
      Given Sifresini dogru yazar
      Then Login butonuna tiklar

      @AllEmpty
      Scenario: Kullanici adi bos - sifre bos
        Given Kullanici giris sayfasindadir
        Then Login butonuna tiklar