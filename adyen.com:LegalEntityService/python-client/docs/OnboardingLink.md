# OnboardingLink


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **str** | The URL of the hosted onboarding page where you need to redirect your user. This URL expires after 4 minutes and can only be used once.  If the link expires, you need to create a new link. | [optional] 

## Example

```python
from openapi_client.models.onboarding_link import OnboardingLink

# TODO update the JSON string below
json = "{}"
# create an instance of OnboardingLink from a JSON string
onboarding_link_instance = OnboardingLink.from_json(json)
# print the JSON string representation of the object
print(OnboardingLink.to_json())

# convert the object into a dict
onboarding_link_dict = onboarding_link_instance.to_dict()
# create an instance of OnboardingLink from a dict
onboarding_link_from_dict = OnboardingLink.from_dict(onboarding_link_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


