(ns imc.logic-test
  (:require [clojure.test :refer :all]
            [imc.logic :refer :all]))

(deftest valor-imc-test
  (testing "Peso Baixo"
    (is (= :baixo-peso (imc-indicador 50 1.70)))
    (is (= :baixo-peso (imc-indicador 1 1))))

  (testing "Peso ideal"
    (is (= :peso-ideal (imc-indicador 70 1.70)))
    (is (= :peso-ideal (imc-indicador 53.9 1.70))))

  (testing "Acima do peso"
    (is (= :acima-peso (imc-indicador 100 1.5)))
    (is (= :acima-peso (imc-indicador 75 1.70)))
    (is (= :acima-peso (imc-indicador 80 1.5)))
    (is (= :acima-peso (imc-indicador 70 1))))

  )