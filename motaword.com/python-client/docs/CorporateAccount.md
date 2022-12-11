# CorporateAccount


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**billing** | [**BillingAddress**](BillingAddress.md) |  | [optional] 
**domain** | **str** |  | [optional] 
**email** | **str** |  | [optional] 
**id** | **int** |  | [optional] 
**logo** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**web_site** | **str** | Deprecated, use &#x60;domain&#x60;. | [optional] 

## Example

```python
from openapi_client.models.corporate_account import CorporateAccount

# TODO update the JSON string below
json = "{}"
# create an instance of CorporateAccount from a JSON string
corporate_account_instance = CorporateAccount.from_json(json)
# print the JSON string representation of the object
print(CorporateAccount.to_json())

# convert the object into a dict
corporate_account_dict = corporate_account_instance.to_dict()
# create an instance of CorporateAccount from a dict
corporate_account_from_dict = CorporateAccount.from_dict(corporate_account_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


