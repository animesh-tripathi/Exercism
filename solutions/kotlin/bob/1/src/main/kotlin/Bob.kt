object Bob {
    fun hey(input: String): String {
        val RESPONSE_ON_SILENCE="Fine. Be that way!"
        val RESPONSE_ON_YELLING="Whoa, chill out!"
        val RESPONSE_ON_YELLING_QUESTION="Calm down, I know what I'm doing!"
        val RESPONSE_ON_QUESTION="Sure."
        val RESPONSE_ON_ANYTHING_ELSE="Whatever."

        val input=input.trim()
        
        if (input.isBlank())
        return RESPONSE_ON_SILENCE
        val isYelling = input.any{it.isLetter()} && input.filter{it.isLetter()}.all{it.isUpperCase()}
        val isQuestioning = input.endsWith("?")
        if (isYelling)
        {
            if(isQuestioning)
            return RESPONSE_ON_YELLING_QUESTION
            
            return RESPONSE_ON_YELLING
        }
        
        if(isQuestioning)
        return RESPONSE_ON_QUESTION
        
        return RESPONSE_ON_ANYTHING_ELSE
        
    }
}
