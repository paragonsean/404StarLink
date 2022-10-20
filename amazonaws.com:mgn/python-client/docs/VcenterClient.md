# VcenterClient

vCenter client.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**arn** | **str** |  | [optional] 
**datacenter_name** | **str** |  | [optional] 
**hostname** | **str** |  | [optional] 
**last_seen_datetime** | **str** |  | [optional] 
**source_server_tags** | **Dict** |  | [optional] 
**tags** | **Dict** |  | [optional] 
**vcenter_client_id** | **str** |  | [optional] 
**vcenter_uuid** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.vcenter_client import VcenterClient

# TODO update the JSON string below
json = "{}"
# create an instance of VcenterClient from a JSON string
vcenter_client_instance = VcenterClient.from_json(json)
# print the JSON string representation of the object
print(VcenterClient.to_json())

# convert the object into a dict
vcenter_client_dict = vcenter_client_instance.to_dict()
# create an instance of VcenterClient from a dict
vcenter_client_from_dict = VcenterClient.from_dict(vcenter_client_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


