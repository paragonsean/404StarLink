# GetTermsOfServiceAcceptanceInfosResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**List[TermsOfServiceAcceptanceInfo]**](TermsOfServiceAcceptanceInfo.md) | The Terms of Service acceptance information. | [optional] 

## Example

```python
from openapi_client.models.get_terms_of_service_acceptance_infos_response import GetTermsOfServiceAcceptanceInfosResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetTermsOfServiceAcceptanceInfosResponse from a JSON string
get_terms_of_service_acceptance_infos_response_instance = GetTermsOfServiceAcceptanceInfosResponse.from_json(json)
# print the JSON string representation of the object
print(GetTermsOfServiceAcceptanceInfosResponse.to_json())

# convert the object into a dict
get_terms_of_service_acceptance_infos_response_dict = get_terms_of_service_acceptance_infos_response_instance.to_dict()
# create an instance of GetTermsOfServiceAcceptanceInfosResponse from a dict
get_terms_of_service_acceptance_infos_response_from_dict = GetTermsOfServiceAcceptanceInfosResponse.from_dict(get_terms_of_service_acceptance_infos_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


