module Haskell_Challenges where
import Data.Char (ord)        -- used for Challenge 2c
import Data.List (elemIndex)  -- useful for Challenge 3a
import Data.Maybe (fromJust)  -- useful for Challenge 3a

{- LEVEL 0: intro -}
-- challenge a
sanityCheck :: Int
sanityCheck = 42


{- LEVEL 1: simple -}
-- challenge a
sign :: Int -> Int
sign num
    | num < 0 = (-1)
    | num == 0 = 0
    | otherwise = 1

-- challenge b
-- take an int and a list of ints. Returns the list raised to the value of the initial int 
powList :: Int -> [Int] -> [Int]
powList exp xs = map (^ exp) xs

-- challenge c
addLists :: [Float] -> [Float] -> [Float]
addLists [] [] = []
addLists list1@(x:xs) list2@(y:ys)
    | (length list1) == (length list2) = (x + y) : (addLists xs ys) 
    | otherwise = []

-- challenge d



{- LEVEL 2: hard -}
-- challenge a


-- challenge b


-- challenge c


-- challenge d



{- LEVEL 3: nightmare fuel -}
-- challenge a
dbzPwrLvls = [["Bulma",       "5"],
              ["Krillin",  "1000"],
              ["Gohan",   "15000"],
              ["Piccolo", "25000"],
              ["Vegeta",  "75000"],
              ["Goku",   "100000"]]



