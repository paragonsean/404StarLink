# OnboardingTheme


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_at** | **datetime** | The creation date of the theme. | 
**description** | **str** | The description of the theme. | [optional] 
**id** | **str** | The unique identifier of the theme. | 
**properties** | **Dict[str, str]** | The properties of the theme. | 
**updated_at** | **datetime** | The date when the theme was last updated. | [optional] 

## Example

```python
from openapi_client.models.onboarding_theme import OnboardingTheme

# TODO update the JSON string below
json = "{}"
# create an instance of OnboardingTheme from a JSON string
onboarding_theme_instance = OnboardingTheme.from_json(json)
# print the JSON string representation of the object
print(OnboardingTheme.to_json())

# convert the object into a dict
onboarding_theme_dict = onboarding_theme_instance.to_dict()
# create an instance of OnboardingTheme from a dict
onboarding_theme_from_dict = OnboardingTheme.from_dict(onboarding_theme_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


