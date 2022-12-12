# coding: utf-8

"""
    Gateway

    Gateway is the hub that routes/orchestrates the interaction between consent managers and API bridges. There are 5 categories of APIs; discovery, link, consent flow, data flow and  monitoring. To reflect the consumers of APIs, the above apis are also categorized under cm facing, hiu facing and hip facing  

    The version of the OpenAPI document: 0.5
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import json
from enum import Enum
from typing_extensions import Self


class ServiceRole(str, Enum):
    """
    ServiceRole
    """

    """
    allowed enum values
    """
    HIP = 'HIP'
    HIU = 'HIU'
    HIP_AND_HIU = 'HIP_AND_HIU'
    HEALTH_LOCKER = 'HEALTH_LOCKER'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of ServiceRole from a JSON string"""
        return cls(json.loads(json_str))


