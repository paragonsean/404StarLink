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
from openapi_client.models.application_application_aggregated_status import ApplicationApplicationAggregatedStatus
from typing import Optional, Set
from typing_extensions import Self

class Application(BaseModel):
    """
    Application
    """ # noqa: E501
    application_aggregated_status: Optional[ApplicationApplicationAggregatedStatus] = Field(default=None, alias="applicationAggregatedStatus")
    application_id: Optional[Any] = Field(default=None, alias="applicationID")
    arn: Optional[Any] = None
    creation_date_time: Optional[Any] = Field(default=None, alias="creationDateTime")
    description: Optional[Any] = None
    is_archived: Optional[Any] = Field(default=None, alias="isArchived")
    last_modified_date_time: Optional[Any] = Field(default=None, alias="lastModifiedDateTime")
    name: Optional[Any] = None
    tags: Optional[Any] = None
    wave_id: Optional[Any] = Field(default=None, alias="waveID")
    __properties: ClassVar[List[str]] = ["applicationAggregatedStatus", "applicationID", "arn", "creationDateTime", "description", "isArchived", "lastModifiedDateTime", "name", "tags", "waveID"]

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
        """Create an instance of Application from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of application_aggregated_status
        if self.application_aggregated_status:
            _dict['applicationAggregatedStatus'] = self.application_aggregated_status.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Application from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "applicationAggregatedStatus": ApplicationApplicationAggregatedStatus.from_dict(obj["applicationAggregatedStatus"]) if obj.get("applicationAggregatedStatus") is not None else None,
            "applicationID": obj.get("applicationID"),
            "arn": obj.get("arn"),
            "creationDateTime": obj.get("creationDateTime"),
            "description": obj.get("description"),
            "isArchived": obj.get("isArchived"),
            "lastModifiedDateTime": obj.get("lastModifiedDateTime"),
            "name": obj.get("name"),
            "tags": obj.get("tags"),
            "waveID": obj.get("waveID")
        })
        return _obj


