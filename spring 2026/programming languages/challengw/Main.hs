main :: IO()
import Data.List (sort)
import Data.Char (ord, chr)

{-
A.	Create a function that returns the sum of all values in a given list of numbers.
-}
sumList :: [Float] -> Float
sumList [] = -1  -- sum of empty list is -1
sumList [x] = x  -- sum of list with 1 item is that item
sumList (h:t) = h + (sumList t)  -- add head to the sum of the rest of the list
--------------------------------------------------------------------------------------

{-
B.	Create a function that returns the maximum of all values in a given list of numbers 
    (try to do this without referencing the examples in the notes or from class).
-}
maxList :: [Int] -> Int
maxList [] = (-1)  -- max of empty list is -1
maxList [x] = x    -- max of list with 1 item is that item
maxList (h:t)
  | h > maxList t = h      -- if head is greater than max of rest of list, then head is the maximum value
  | otherwise = maxList t  -- otherwise max of the rest of the list is the maximum value
--------------------------------------------------------------------------------------

{-
C.	Create a function that returns the 3rd to last item in a given list.
    If this list contains less than 3 items, return -1.
-}
thirdToLastItem :: [Int] -> Int
thirdToLastItem list
  | length list < 3 = (-1)  -- if less than 3 items in list, there is no third to last item so return -1
  | otherwise = list !! ((length list) - 3) -- index at list length minus 3
--------------------------------------------------------------------------------------

{-
D.	Create a function that operates similarly to Python’s range function.
    Given a minimum and a maximum, the function should return a list with all integers in between.
    For this function you can’t use the .. syntax in Haskell (for example, you can’t use [min..max]).
-}
range :: Int -> Int -> [Int]
range minNum maxNum
  | minNum > maxNum = []        -- if min is greater than max, this is invalid so return empty list
  | minNum == maxNum = [minNum] -- if min is equal to max, return list with only that number in it
  | otherwise = minNum : range (minNum + 1) maxNum -- construct list with minNum prepended to the rest (which is [min+1 up to max])
--------------------------------------------------------------------------------------

{-
E.	Create a function that will return the sum of all values in a given list
    that are greater than the average value for that list.
-}
avgList :: [Float] -> Float
avgList list = (sumList list) / (fromIntegral $ length list) -- sum of list divided by size of list

greaterThanAvg :: [Float] -> [Float]
greaterThanAvg list = filter (> (avgList list)) list -- filter out all numbers not greater than average
--------------------------------------------------------------------------------------

{-
F.	Create a function that returns the median of the even values in a given list.
-}
medianOfEvens :: [Int] -> Int
medianOfEvens list = 
  (sort evenList) !! ((length evenList) `div` 2)       -- sort the list of even numbers then return the middle number
  where evenList = filter (\ x -> x `mod` 2 == 0) list -- only the even numbers in the list
--------------------------------------------------------------------------------------

{-
G.	Create a function that returns all consecutive integers from 0 to the length of a given word – 1.
-}
consecutiveInts :: String -> [Int]
consecutiveInts word = range 0 $ (length word) - 1 -- uses range function above
--------------------------------------------------------------------------------------

{-
H.	Create a function that takes in a string and returns the same string but with commas
    between all the characters.
-}
commaDelimited :: String -> String
commaDelimited string =
  init $           -- strip trailing comma
  foldl (++) "" $  -- combine into a single string (i.e. join)
  map (++ ",") $   -- append comma to each string
  map (:[]) string -- convert to list of strings with one char each
--------------------------------------------------------------------------------------

{-
I.	Create a function that returns the ASCII value of the letter closest to 'a' in the given string.
-}
letterClosestToA :: String -> Int
letterClosestToA string = 
  foldl min (ord 'z') $  -- find the letter closest to 'a'
  filter (\x -> x >= (ord 'a') && x <= (ord 'z')) $ -- get rid of all characters that are not a lowercase letter
  map ord string  -- convert to list of ascii values
--------------------------------------------------------------------------------------
