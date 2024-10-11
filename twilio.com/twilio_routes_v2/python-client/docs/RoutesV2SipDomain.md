# RoutesV2SipDomain


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_sid** | **str** |  | [optional] 
**date_created** | **datetime** |  | [optional] 
**date_updated** | **datetime** |  | [optional] 
**friendly_name** | **str** |  | [optional] 
**sid** | **str** |  | [optional] 
**sip_domain** | **str** |  | [optional] 
**url** | **str** |  | [optional] 
**voice_region** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.routes_v2_sip_domain import RoutesV2SipDomain

# TODO update the JSON string below
json = "{}"
# create an instance of RoutesV2SipDomain from a JSON string
routes_v2_sip_domain_instance = RoutesV2SipDomain.from_json(json)
# print the JSON string representation of the object
print(RoutesV2SipDomain.to_json())

# convert the object into a dict
routes_v2_sip_domain_dict = routes_v2_sip_domain_instance.to_dict()
# create an instance of RoutesV2SipDomain from a dict
routes_v2_sip_domain_from_dict = RoutesV2SipDomain.from_dict(routes_v2_sip_domain_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


