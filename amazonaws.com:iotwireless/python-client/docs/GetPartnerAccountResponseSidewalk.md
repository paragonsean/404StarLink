# GetPartnerAccountResponseSidewalk


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amazon_id** | **str** |  | [optional] 
**fingerprint** | **str** |  | [optional] 
**arn** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.get_partner_account_response_sidewalk import GetPartnerAccountResponseSidewalk

# TODO update the JSON string below
json = "{}"
# create an instance of GetPartnerAccountResponseSidewalk from a JSON string
get_partner_account_response_sidewalk_instance = GetPartnerAccountResponseSidewalk.from_json(json)
# print the JSON string representation of the object
print(GetPartnerAccountResponseSidewalk.to_json())

# convert the object into a dict
get_partner_account_response_sidewalk_dict = get_partner_account_response_sidewalk_instance.to_dict()
# create an instance of GetPartnerAccountResponseSidewalk from a dict
get_partner_account_response_sidewalk_from_dict = GetPartnerAccountResponseSidewalk.from_dict(get_partner_account_response_sidewalk_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


