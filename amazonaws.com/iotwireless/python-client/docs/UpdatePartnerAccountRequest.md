# UpdatePartnerAccountRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sidewalk** | [**UpdatePartnerAccountRequestSidewalk**](UpdatePartnerAccountRequestSidewalk.md) |  | 

## Example

```python
from openapi_client.models.update_partner_account_request import UpdatePartnerAccountRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdatePartnerAccountRequest from a JSON string
update_partner_account_request_instance = UpdatePartnerAccountRequest.from_json(json)
# print the JSON string representation of the object
print(UpdatePartnerAccountRequest.to_json())

# convert the object into a dict
update_partner_account_request_dict = update_partner_account_request_instance.to_dict()
# create an instance of UpdatePartnerAccountRequest from a dict
update_partner_account_request_from_dict = UpdatePartnerAccountRequest.from_dict(update_partner_account_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


