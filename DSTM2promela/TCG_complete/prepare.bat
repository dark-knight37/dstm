:: Arguments are:
:: %1: temporary working directory
:: %2: working script

:: delete temporary directory
RD /S /Q "%1"

:: create temporary directory
mkdir "%1"

:: copy script and file to temp directory
COPY "%2" "%1"
COPY "spin.exe" "%1"

:: change directory
cd "%1"


