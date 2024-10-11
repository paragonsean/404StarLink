# GsmNmrObj

GSM object for network measurement reports.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bsic** | **int** |  | 
**bcch** | **int** |  | 
**rx_level** | **int** |  | [optional] 
**global_identity** | [**GsmNmrObjGlobalIdentity**](GsmNmrObjGlobalIdentity.md) |  | [optional] 

## Example

```python
from openapi_client.models.gsm_nmr_obj import GsmNmrObj

# TODO update the JSON string below
json = "{}"
# create an instance of GsmNmrObj from a JSON string
gsm_nmr_obj_instance = GsmNmrObj.from_json(json)
# print the JSON string representation of the object
print(GsmNmrObj.to_json())

# convert the object into a dict
gsm_nmr_obj_dict = gsm_nmr_obj_instance.to_dict()
# create an instance of GsmNmrObj from a dict
gsm_nmr_obj_from_dict = GsmNmrObj.from_dict(gsm_nmr_obj_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


