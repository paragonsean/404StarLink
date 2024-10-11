# DataReplicationInitiationStep

Data replication initiation step.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | [**DataReplicationInitiationStepName**](DataReplicationInitiationStepName.md) |  | [optional] 
**status** | [**DataReplicationInitiationStepStatus**](DataReplicationInitiationStepStatus.md) |  | [optional] 

## Example

```python
from openapi_client.models.data_replication_initiation_step import DataReplicationInitiationStep

# TODO update the JSON string below
json = "{}"
# create an instance of DataReplicationInitiationStep from a JSON string
data_replication_initiation_step_instance = DataReplicationInitiationStep.from_json(json)
# print the JSON string representation of the object
print(DataReplicationInitiationStep.to_json())

# convert the object into a dict
data_replication_initiation_step_dict = data_replication_initiation_step_instance.to_dict()
# create an instance of DataReplicationInitiationStep from a dict
data_replication_initiation_step_from_dict = DataReplicationInitiationStep.from_dict(data_replication_initiation_step_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


