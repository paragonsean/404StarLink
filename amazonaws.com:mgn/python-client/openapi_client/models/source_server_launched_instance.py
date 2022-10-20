# coding: utf-8

"""
    Application Migration Service

    The Application Migration Service service.

    The version of the OpenAPI document: 2020-02-26
    Contact: mike.ralphson@gmail.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.first_boot import FirstBoot
from openapi_client.models.str import str
from typing import Optional, Set
from typing_extensions import Self

class SourceServerLaunchedInstance(BaseModel):
    """
    SourceServerLaunchedInstance
    """ # noqa: E501
    ec2_instance_id: Optional[Any] = Field(default=None, alias="ec2InstanceID")
    first_boot: Optional[Any] = Field(default=None, alias="firstBoot")
    job_id: Optional[Any] = Field(default=None, alias="jobID")
    __properties: ClassVar[List[str]] = ["ec2InstanceID", "firstBoot", "jobID"]

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
        """Create an instance of SourceServerLaunchedInstance from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of first_boot
        if self.first_boot:
            _dict['firstBoot'] = self.first_boot.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of SourceServerLaunchedInstance from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "ec2InstanceID": obj.get("ec2InstanceID"),
            "firstBoot": FirstBoot.from_dict(obj["firstBoot"]) if obj.get("firstBoot") is not None else None,
            "jobID": obj.get("jobID")
        })
        return _obj


