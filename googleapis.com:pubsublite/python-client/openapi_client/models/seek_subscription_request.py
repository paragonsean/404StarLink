# coding: utf-8

"""
    Pub/Sub Lite API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

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
from openapi_client.models.time_target import TimeTarget
from typing import Optional, Set
from typing_extensions import Self

class SeekSubscriptionRequest(BaseModel):
    """
    Request for SeekSubscription.
    """ # noqa: E501
    named_target: Optional[StrictStr] = Field(default=None, description="Seek to a named position with respect to the message backlog.", alias="namedTarget")
    time_target: Optional[TimeTarget] = Field(default=None, alias="timeTarget")
    __properties: ClassVar[List[str]] = ["namedTarget", "timeTarget"]

    @field_validator('named_target')
    def named_target_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in set(['NAMED_TARGET_UNSPECIFIED', 'TAIL', 'HEAD']):
            raise ValueError("must be one of enum values ('NAMED_TARGET_UNSPECIFIED', 'TAIL', 'HEAD')")
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
        """Create an instance of SeekSubscriptionRequest from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of time_target
        if self.time_target:
            _dict['timeTarget'] = self.time_target.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of SeekSubscriptionRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "namedTarget": obj.get("namedTarget"),
            "timeTarget": TimeTarget.from_dict(obj["timeTarget"]) if obj.get("timeTarget") is not None else None
        })
        return _obj


