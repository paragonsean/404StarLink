# OnboardingThemes


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**next** | **str** | The next page. Only present if there is a next page. | [optional] 
**previous** | **str** | The previous page. Only present if there is a previous page. | [optional] 
**themes** | [**List[OnboardingTheme]**](OnboardingTheme.md) | List of onboarding themes. | 

## Example

```python
from openapi_client.models.onboarding_themes import OnboardingThemes

# TODO update the JSON string below
json = "{}"
# create an instance of OnboardingThemes from a JSON string
onboarding_themes_instance = OnboardingThemes.from_json(json)
# print the JSON string representation of the object
print(OnboardingThemes.to_json())

# convert the object into a dict
onboarding_themes_dict = onboarding_themes_instance.to_dict()
# create an instance of OnboardingThemes from a dict
onboarding_themes_from_dict = OnboardingThemes.from_dict(onboarding_themes_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


