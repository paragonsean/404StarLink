# SurveyAnswer


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**answer** | **str** |  | [optional] 
**project_id** | **int** |  | [optional] 
**question_answer_id** | **int** |  | [optional] 
**question_id** | **int** |  | [optional] 
**user_id** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.survey_answer import SurveyAnswer

# TODO update the JSON string below
json = "{}"
# create an instance of SurveyAnswer from a JSON string
survey_answer_instance = SurveyAnswer.from_json(json)
# print the JSON string representation of the object
print(SurveyAnswer.to_json())

# convert the object into a dict
survey_answer_dict = survey_answer_instance.to_dict()
# create an instance of SurveyAnswer from a dict
survey_answer_from_dict = SurveyAnswer.from_dict(survey_answer_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


