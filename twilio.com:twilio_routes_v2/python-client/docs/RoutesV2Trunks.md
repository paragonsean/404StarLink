# RoutesV2Trunks


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_sid** | **str** | The unique SID identifier of the Account. | [optional] 
**date_created** | **datetime** | The date that this SIP Trunk was assigned an Inbound Processing Region, given in ISO 8601 format. | [optional] 
**date_updated** | **datetime** | The date that the Inbound Processing Region was updated for this SIP Trunk, given in ISO 8601 format. | [optional] 
**friendly_name** | **str** | A human readable description of the Inbound Processing Region assignments for this SIP Trunk, up to 64 characters. | [optional] 
**sid** | **str** | A 34 character string that uniquely identifies the Inbound Processing Region assignments for this SIP Trunk. | [optional] 
**sip_trunk_domain** | **str** | The absolute URL of the SIP Trunk | [optional] 
**url** | **str** | The absolute URL of the resource. | [optional] 
**voice_region** | **str** | The Inbound Processing Region used for this SIP Trunk for voice. | [optional] 

## Example

```python
from openapi_client.models.routes_v2_trunks import RoutesV2Trunks

# TODO update the JSON string below
json = "{}"
# create an instance of RoutesV2Trunks from a JSON string
routes_v2_trunks_instance = RoutesV2Trunks.from_json(json)
# print the JSON string representation of the object
print(RoutesV2Trunks.to_json())

# convert the object into a dict
routes_v2_trunks_dict = routes_v2_trunks_instance.to_dict()
# create an instance of RoutesV2Trunks from a dict
routes_v2_trunks_from_dict = RoutesV2Trunks.from_dict(routes_v2_trunks_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


