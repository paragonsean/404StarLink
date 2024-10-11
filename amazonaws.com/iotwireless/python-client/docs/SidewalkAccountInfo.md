# SidewalkAccountInfo

Information about a Sidewalk account.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amazon_id** | **str** |  | [optional] 
**app_server_private_key** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.sidewalk_account_info import SidewalkAccountInfo

# TODO update the JSON string below
json = "{}"
# create an instance of SidewalkAccountInfo from a JSON string
sidewalk_account_info_instance = SidewalkAccountInfo.from_json(json)
# print the JSON string representation of the object
print(SidewalkAccountInfo.to_json())

# convert the object into a dict
sidewalk_account_info_dict = sidewalk_account_info_instance.to_dict()
# create an instance of SidewalkAccountInfo from a dict
sidewalk_account_info_from_dict = SidewalkAccountInfo.from_dict(sidewalk_account_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


