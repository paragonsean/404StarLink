# ListPartnerAccountsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**next_token** | **str** |  | [optional] 
**sidewalk** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.list_partner_accounts_response import ListPartnerAccountsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListPartnerAccountsResponse from a JSON string
list_partner_accounts_response_instance = ListPartnerAccountsResponse.from_json(json)
# print the JSON string representation of the object
print(ListPartnerAccountsResponse.to_json())

# convert the object into a dict
list_partner_accounts_response_dict = list_partner_accounts_response_instance.to_dict()
# create an instance of ListPartnerAccountsResponse from a dict
list_partner_accounts_response_from_dict = ListPartnerAccountsResponse.from_dict(list_partner_accounts_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


