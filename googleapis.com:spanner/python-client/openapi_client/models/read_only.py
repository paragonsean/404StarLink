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

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from typing import Optional, Set
from typing_extensions import Self

class ReadOnly(BaseModel):
    """
    Message type to initiate a read-only transaction.
    """ # noqa: E501
    exact_staleness: Optional[StrictStr] = Field(default=None, description="Executes all reads at a timestamp that is `exact_staleness` old. The timestamp is chosen soon after the read is started. Guarantees that all writes that have committed more than the specified number of seconds ago are visible. Because Cloud Spanner chooses the exact timestamp, this mode works even if the client's local clock is substantially skewed from Cloud Spanner commit timestamps. Useful for reading at nearby replicas without the distributed timestamp negotiation overhead of `max_staleness`.", alias="exactStaleness")
    max_staleness: Optional[StrictStr] = Field(default=None, description="Read data at a timestamp >= `NOW - max_staleness` seconds. Guarantees that all writes that have committed more than the specified number of seconds ago are visible. Because Cloud Spanner chooses the exact timestamp, this mode works even if the client's local clock is substantially skewed from Cloud Spanner commit timestamps. Useful for reading the freshest data available at a nearby replica, while bounding the possible staleness if the local replica has fallen behind. Note that this option can only be used in single-use transactions.", alias="maxStaleness")
    min_read_timestamp: Optional[StrictStr] = Field(default=None, description="Executes all reads at a timestamp >= `min_read_timestamp`. This is useful for requesting fresher data than some previous read, or data that is fresh enough to observe the effects of some previously committed transaction whose timestamp is known. Note that this option can only be used in single-use transactions. A timestamp in RFC3339 UTC \\\"Zulu\\\" format, accurate to nanoseconds. Example: `\"2014-10-02T15:01:23.045123456Z\"`.", alias="minReadTimestamp")
    read_timestamp: Optional[StrictStr] = Field(default=None, description="Executes all reads at the given timestamp. Unlike other modes, reads at a specific timestamp are repeatable; the same read at the same timestamp always returns the same data. If the timestamp is in the future, the read will block until the specified timestamp, modulo the read's deadline. Useful for large scale consistent reads such as mapreduces, or for coordinating many reads against a consistent snapshot of the data. A timestamp in RFC3339 UTC \\\"Zulu\\\" format, accurate to nanoseconds. Example: `\"2014-10-02T15:01:23.045123456Z\"`.", alias="readTimestamp")
    return_read_timestamp: Optional[StrictBool] = Field(default=None, description="If true, the Cloud Spanner-selected read timestamp is included in the Transaction message that describes the transaction.", alias="returnReadTimestamp")
    strong: Optional[StrictBool] = Field(default=None, description="Read at a timestamp where all previously committed transactions are visible.")
    __properties: ClassVar[List[str]] = ["exactStaleness", "maxStaleness", "minReadTimestamp", "readTimestamp", "returnReadTimestamp", "strong"]

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
        """Create an instance of ReadOnly from a JSON string"""
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
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of ReadOnly from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "exactStaleness": obj.get("exactStaleness"),
            "maxStaleness": obj.get("maxStaleness"),
            "minReadTimestamp": obj.get("minReadTimestamp"),
            "readTimestamp": obj.get("readTimestamp"),
            "returnReadTimestamp": obj.get("returnReadTimestamp"),
            "strong": obj.get("strong")
        })
        return _obj


