import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listBalancemobilityfactors(query) {
  return request({
    url: '/system/balancemobilityfactors/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getBalancemobilityfactors(elderlyId) {
  return request({
    url: '/system/balancemobilityfactors/' + elderlyId,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addBalancemobilityfactors(data) {
  return request({
    url: '/system/balancemobilityfactors',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateBalancemobilityfactors(data) {
  return request({
    url: '/system/balancemobilityfactors',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delBalancemobilityfactors(elderlyId) {
  return request({
    url: '/system/balancemobilityfactors/' + elderlyId,
    method: 'delete'
  })
}
