# PrincipioSolidIoC
Aplico el principio SOLID IoC (inversión de control) para descomponer y desacoplar.

En este ejercicio:

Para la tasa de interes el cálculo varia de acuerdo al banco. Por ello se crea la interfaz RateCalculator y se utiliza IoC para invocar desde InterestCalculator a la implementación que cada banco realiza, obteniendo el cálculo del interés del mismo.

