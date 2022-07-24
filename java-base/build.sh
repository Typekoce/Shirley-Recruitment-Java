clear
echo "--------------------------------------------------------------"
# Remove previous build folder
rm -R build/
rm -R tests/build/

# Create build folder
mkdir -p build
mkdir -p tests/build

# Change to App folder
cd app/
cp *.* ../build

# Copy Controllers
cd ../controllers/
cp *.* ../build

# Copy Routes
cd ../routes/
cp *.* ../build

# Copy Models
cd ../models/
cp *.* ../build

# Copy Views
cd ../views/
cp -R * ../build

# Copy libraries
cd ../libraries/
cp *.* ../build

# Change to build folder
cd ../build
cp *.* ../tests/build

javac App.java
# Testing adding libraries
#javac -cp "sample.jar" App.java

# Clean up
rm *.java

# Run App
java App
