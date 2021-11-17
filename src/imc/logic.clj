(ns imc.logic)

;; imc = (peso / (altura)**2)
;; <18,5 baixo peso
;; >=18,5 < 24,9 peso ideal;
;;  > 24,9 acima do peso

(defn- valor-imc
  [peso altura]
  (/ peso (* altura altura)))

(defn imc-indicador
  [peso altura]
  (let [imc (valor-imc peso altura)]
  (if (< imc 18.5)
    :baixo-peso
    (if (< imc 24.9)
      :peso-ideal
      :acima-peso))))

(imc-indicador 75 1.70)
