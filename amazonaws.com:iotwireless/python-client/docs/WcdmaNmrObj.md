# WcdmaNmrObj

Network Measurement Reports.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uarfcndl** | **int** |  | 
**psc** | **int** |  | 
**utran_cid** | **int** |  | 
**rscp** | **int** |  | [optional] 
**path_loss** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.wcdma_nmr_obj import WcdmaNmrObj

# TODO update the JSON string below
json = "{}"
# create an instance of WcdmaNmrObj from a JSON string
wcdma_nmr_obj_instance = WcdmaNmrObj.from_json(json)
# print the JSON string representation of the object
print(WcdmaNmrObj.to_json())

# convert the object into a dict
wcdma_nmr_obj_dict = wcdma_nmr_obj_instance.to_dict()
# create an instance of WcdmaNmrObj from a dict
wcdma_nmr_obj_from_dict = WcdmaNmrObj.from_dict(wcdma_nmr_obj_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


