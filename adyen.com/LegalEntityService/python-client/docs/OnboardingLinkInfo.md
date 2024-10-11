# OnboardingLinkInfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**locale** | **str** | The language that will be used for the page, specified by a combination of two letter [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language and [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. See [possible values](https://docs.adyen.com/marketplaces-and-platforms/collect-verification-details/hosted#supported-languages).   If not specified in the request or if the language is not supported, the page uses the browser language. If the browser language is not supported, the page uses **en-US** by default. | [optional] 
**redirect_url** | **str** | The URL where the user is redirected after they complete hosted onboarding. | [optional] 
**settings** | **Dict[str, bool]** | Boolean key-value pairs indicating the settings for the hosted onboarding page. The keys are the settings. By default, the values are set to **true**. Set to **false** to not allow the action.  Possible keys:  - **changeLegalEntityType**: The user can change their legal entity type.  - **editPrefilledCountry**: The user can change the country of their legal entity&#39;s address, for example the registered address of an organization.   | [optional] 
**theme_id** | **str** | The unique identifier of the hosted onboarding theme. | [optional] 

## Example

```python
from openapi_client.models.onboarding_link_info import OnboardingLinkInfo

# TODO update the JSON string below
json = "{}"
# create an instance of OnboardingLinkInfo from a JSON string
onboarding_link_info_instance = OnboardingLinkInfo.from_json(json)
# print the JSON string representation of the object
print(OnboardingLinkInfo.to_json())

# convert the object into a dict
onboarding_link_info_dict = onboarding_link_info_instance.to_dict()
# create an instance of OnboardingLinkInfo from a dict
onboarding_link_info_from_dict = OnboardingLinkInfo.from_dict(onboarding_link_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


