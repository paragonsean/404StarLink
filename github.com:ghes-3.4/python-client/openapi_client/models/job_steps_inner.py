# coding: utf-8

"""
    GitHub v3 REST API

    GitHub's v3 REST API.

    The version of the OpenAPI document: 1.1.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from datetime import datetime
from pydantic import BaseModel, ConfigDict, Field, StrictInt, StrictStr, field_validator
from typing import Any, ClassVar, Dict, List, Optional
from typing import Optional, Set
from typing_extensions import Self

class JobStepsInner(BaseModel):
    """
    JobStepsInner
    """ # noqa: E501
    completed_at: Optional[datetime] = Field(default=None, description="The time that the job finished, in ISO 8601 format.")
    conclusion: Optional[StrictStr] = Field(description="The outcome of the job.")
    name: StrictStr = Field(description="The name of the job.")
    number: StrictInt
    started_at: Optional[datetime] = Field(default=None, description="The time that the step started, in ISO 8601 format.")
    status: StrictStr = Field(description="The phase of the lifecycle that the job is currently in.")
    __properties: ClassVar[List[str]] = ["completed_at", "conclusion", "name", "number", "started_at", "status"]

    @field_validator('status')
    def status_validate_enum(cls, value):
        """Validates the enum"""
        if value not in set(['queued', 'in_progress', 'completed']):
            raise ValueError("must be one of enum values ('queued', 'in_progress', 'completed')")
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
        """Create an instance of JobStepsInner from a JSON string"""
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
        # set to None if completed_at (nullable) is None
        # and model_fields_set contains the field
        if self.completed_at is None and "completed_at" in self.model_fields_set:
            _dict['completed_at'] = None

        # set to None if conclusion (nullable) is None
        # and model_fields_set contains the field
        if self.conclusion is None and "conclusion" in self.model_fields_set:
            _dict['conclusion'] = None

        # set to None if started_at (nullable) is None
        # and model_fields_set contains the field
        if self.started_at is None and "started_at" in self.model_fields_set:
            _dict['started_at'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of JobStepsInner from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "completed_at": obj.get("completed_at"),
            "conclusion": obj.get("conclusion"),
            "name": obj.get("name"),
            "number": obj.get("number"),
            "started_at": obj.get("started_at"),
            "status": obj.get("status")
        })
        return _obj


