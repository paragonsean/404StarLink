# SurveyQuestionQuestion


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enabled** | **bool** |  | [optional] 
**format** | **str** |  | [optional] 
**id** | **int** |  | [optional] 
**question** | **str** |  | [optional] 
**text** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.survey_question_question import SurveyQuestionQuestion

# TODO update the JSON string below
json = "{}"
# create an instance of SurveyQuestionQuestion from a JSON string
survey_question_question_instance = SurveyQuestionQuestion.from_json(json)
# print the JSON string representation of the object
print(SurveyQuestionQuestion.to_json())

# convert the object into a dict
survey_question_question_dict = survey_question_question_instance.to_dict()
# create an instance of SurveyQuestionQuestion from a dict
survey_question_question_from_dict = SurveyQuestionQuestion.from_dict(survey_question_question_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


