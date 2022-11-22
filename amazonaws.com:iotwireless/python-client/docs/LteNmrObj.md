# LteNmrObj

LTE object for network measurement reports.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pci** | **int** |  | 
**earfcn** | **int** |  | 
**eutran_cid** | **int** |  | 
**rsrp** | **int** |  | [optional] 
**rsrq** | **float** |  | [optional] 

## Example

```python
from openapi_client.models.lte_nmr_obj import LteNmrObj

# TODO update the JSON string below
json = "{}"
# create an instance of LteNmrObj from a JSON string
lte_nmr_obj_instance = LteNmrObj.from_json(json)
# print the JSON string representation of the object
print(LteNmrObj.to_json())

# convert the object into a dict
lte_nmr_obj_dict = lte_nmr_obj_instance.to_dict()
# create an instance of LteNmrObj from a dict
lte_nmr_obj_from_dict = LteNmrObj.from_dict(lte_nmr_obj_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


