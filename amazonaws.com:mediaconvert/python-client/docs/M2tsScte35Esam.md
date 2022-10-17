# M2tsScte35Esam

Settings for SCTE-35 signals from ESAM. Include this in your job settings to put SCTE-35 markers in your HLS and transport stream outputs at the insertion points that you specify in an ESAM XML document. Provide the document in the setting SCC XML (sccXml).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scte35_esam_pid** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.m2ts_scte35_esam import M2tsScte35Esam

# TODO update the JSON string below
json = "{}"
# create an instance of M2tsScte35Esam from a JSON string
m2ts_scte35_esam_instance = M2tsScte35Esam.from_json(json)
# print the JSON string representation of the object
print(M2tsScte35Esam.to_json())

# convert the object into a dict
m2ts_scte35_esam_dict = m2ts_scte35_esam_instance.to_dict()
# create an instance of M2tsScte35Esam from a dict
m2ts_scte35_esam_from_dict = M2tsScte35Esam.from_dict(m2ts_scte35_esam_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


