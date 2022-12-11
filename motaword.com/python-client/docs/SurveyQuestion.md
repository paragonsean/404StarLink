# SurveyQuestion


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**answers** | [**List[SimpleModel]**](SimpleModel.md) |  | [optional] 
**question** | [**SurveyQuestionQuestion**](SurveyQuestionQuestion.md) |  | [optional] 
**question_answers** | [**List[SimpleModel]**](SimpleModel.md) |  | [optional] 

## Example

```python
from openapi_client.models.survey_question import SurveyQuestion

# TODO update the JSON string below
json = "{}"
# create an instance of SurveyQuestion from a JSON string
survey_question_instance = SurveyQuestion.from_json(json)
# print the JSON string representation of the object
print(SurveyQuestion.to_json())

# convert the object into a dict
survey_question_dict = survey_question_instance.to_dict()
# create an instance of SurveyQuestion from a dict
survey_question_from_dict = SurveyQuestion.from_dict(survey_question_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


