# TermsOfServiceAcceptanceInfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accepted_by** | **str** | The unique identifier of the user that accepted the Terms of Service. | [optional] 
**accepted_for** | **str** | The unique identifier of the legal entity for which the Terms of Service are accepted. | [optional] 
**created_at** | **datetime** | The date when the Terms of Service were accepted. | [optional] 
**id** | **str** | An Adyen-generated reference for the accepted Terms of Service. | [optional] 
**type** | **str** | The type of Terms of Service. | [optional] 

## Example

```python
from openapi_client.models.terms_of_service_acceptance_info import TermsOfServiceAcceptanceInfo

# TODO update the JSON string below
json = "{}"
# create an instance of TermsOfServiceAcceptanceInfo from a JSON string
terms_of_service_acceptance_info_instance = TermsOfServiceAcceptanceInfo.from_json(json)
# print the JSON string representation of the object
print(TermsOfServiceAcceptanceInfo.to_json())

# convert the object into a dict
terms_of_service_acceptance_info_dict = terms_of_service_acceptance_info_instance.to_dict()
# create an instance of TermsOfServiceAcceptanceInfo from a dict
terms_of_service_acceptance_info_from_dict = TermsOfServiceAcceptanceInfo.from_dict(terms_of_service_acceptance_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


