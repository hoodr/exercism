#Drew Hoo
#Still Procrastinating HW
import collections
import string

def word_count(word):
	lower_case = word.lower()
	new_dict = collections.Counter(lower_case.split())
	#phrase = lower_case.split()
	#for key in phrase:
	#	new_dict[key] += 1
	return new_dict

