# SurveyAnswers


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**answers** | [**List[SurveyAnswer]**](SurveyAnswer.md) |  | [optional] 

## Example

```python
from openapi_client.models.survey_answers import SurveyAnswers

# TODO update the JSON string below
json = "{}"
# create an instance of SurveyAnswers from a JSON string
survey_answers_instance = SurveyAnswers.from_json(json)
# print the JSON string representation of the object
print(SurveyAnswers.to_json())

# convert the object into a dict
survey_answers_dict = survey_answers_instance.to_dict()
# create an instance of SurveyAnswers from a dict
survey_answers_from_dict = SurveyAnswers.from_dict(survey_answers_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


