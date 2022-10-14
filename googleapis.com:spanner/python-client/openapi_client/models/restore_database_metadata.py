# coding: utf-8

"""
    Cloud Spanner API

    Cloud Spanner is a managed, mission-critical, globally consistent and scalable relational database service.

    The version of the OpenAPI document: v1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictStr, field_validator
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.backup_info import BackupInfo
from openapi_client.models.operation_progress import OperationProgress
from typing import Optional, Set
from typing_extensions import Self

class RestoreDatabaseMetadata(BaseModel):
    """
    Metadata type for the long-running operation returned by RestoreDatabase.
    """ # noqa: E501
    backup_info: Optional[BackupInfo] = Field(default=None, alias="backupInfo")
    cancel_time: Optional[StrictStr] = Field(default=None, description="The time at which cancellation of this operation was received. Operations.CancelOperation starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.", alias="cancelTime")
    name: Optional[StrictStr] = Field(default=None, description="Name of the database being created and restored to.")
    optimize_database_operation_name: Optional[StrictStr] = Field(default=None, description="If exists, the name of the long-running operation that will be used to track the post-restore optimization process to optimize the performance of the restored database, and remove the dependency on the restore source. The name is of the form `projects//instances//databases//operations/` where the is the name of database being created and restored to. The metadata type of the long-running operation is OptimizeRestoredDatabaseMetadata. This long-running operation will be automatically created by the system after the RestoreDatabase long-running operation completes successfully. This operation will not be created if the restore was not successful.", alias="optimizeDatabaseOperationName")
    progress: Optional[OperationProgress] = None
    source_type: Optional[StrictStr] = Field(default=None, description="The type of the restore source.", alias="sourceType")
    __properties: ClassVar[List[str]] = ["backupInfo", "cancelTime", "name", "optimizeDatabaseOperationName", "progress", "sourceType"]

    @field_validator('source_type')
    def source_type_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in set(['TYPE_UNSPECIFIED', 'BACKUP']):
            raise ValueError("must be one of enum values ('TYPE_UNSPECIFIED', 'BACKUP')")
        return value

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of RestoreDatabaseMetadata from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        excluded_fields: Set[str] = set([
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of backup_info
        if self.backup_info:
            _dict['backupInfo'] = self.backup_info.to_dict()
        # override the default output from pydantic by calling `to_dict()` of progress
        if self.progress:
            _dict['progress'] = self.progress.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of RestoreDatabaseMetadata from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "backupInfo": BackupInfo.from_dict(obj["backupInfo"]) if obj.get("backupInfo") is not None else None,
            "cancelTime": obj.get("cancelTime"),
            "name": obj.get("name"),
            "optimizeDatabaseOperationName": obj.get("optimizeDatabaseOperationName"),
            "progress": OperationProgress.from_dict(obj["progress"]) if obj.get("progress") is not None else None,
            "sourceType": obj.get("sourceType")
        })
        return _obj


