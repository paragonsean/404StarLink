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

from pydantic import BaseModel, ConfigDict, Field, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.instance_config import InstanceConfig
from openapi_client.models.instance_operation_progress import InstanceOperationProgress
from typing import Optional, Set
from typing_extensions import Self

class CreateInstanceConfigMetadata(BaseModel):
    """
    Metadata type for the operation returned by CreateInstanceConfig.
    """ # noqa: E501
    cancel_time: Optional[StrictStr] = Field(default=None, description="The time at which this operation was cancelled.", alias="cancelTime")
    instance_config: Optional[InstanceConfig] = Field(default=None, alias="instanceConfig")
    progress: Optional[InstanceOperationProgress] = None
    __properties: ClassVar[List[str]] = ["cancelTime", "instanceConfig", "progress"]

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
        """Create an instance of CreateInstanceConfigMetadata from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of instance_config
        if self.instance_config:
            _dict['instanceConfig'] = self.instance_config.to_dict()
        # override the default output from pydantic by calling `to_dict()` of progress
        if self.progress:
            _dict['progress'] = self.progress.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of CreateInstanceConfigMetadata from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "cancelTime": obj.get("cancelTime"),
            "instanceConfig": InstanceConfig.from_dict(obj["instanceConfig"]) if obj.get("instanceConfig") is not None else None,
            "progress": InstanceOperationProgress.from_dict(obj["progress"]) if obj.get("progress") is not None else None
        })
        return _obj


