#Drew Hoo
#Still Procrastinating HW
#'rah rah ah ah ah\troma roma ma\tga ga oh la la\twant your bad romance'
import collections
import string

def word_count(word):
	lower_case = word.lower()
	new_dict = collections.Counter(lower_case.split())
	#phrase = lower_case.split()
	#for key in phrase:
	#	new_dict[key] += 1
	return new_dict

def word_count2(word):
	new_dict = {}
	phrase = word.split()
	for key in phrase:
		if key not in new_dict:
			new_dict[key] = 1
		else:
			new_dict[key] += 1
	return new_dict
	#for key in NewDict:
	#	print key + " = " + str(NewDict[key])
